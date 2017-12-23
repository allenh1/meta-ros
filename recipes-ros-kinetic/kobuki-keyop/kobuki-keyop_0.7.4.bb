# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Keyboard teleoperation for Kobuki: relays commands from a keyboard to Kobuki."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-exceptions ecl-threads ecl-time geometry-msgs kobuki-msgs roscpp std-msgs std-srvs yocs-cmd-vel-mux yocs-velocity-smoother"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_keyop/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e1f7383c6fca1ea7e68e4a345ef6934"
SRC_URI[sha256sum] = "316fbd1b3aaa85e1f2ea6247e129eaf3f320014e9f33dc9a4fe95034ee714c70"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_keyop-0.7.4-0"

inherit catkin
