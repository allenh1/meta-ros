# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Joystick teleoperation for your robot robot core"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-exceptions ecl-time geometry-msgs joy roscpp sensor-msgs std-msgs yocs-msgs"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_joyop/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "954755a49da47e30e157111e7b2a352b"
SRC_URI[sha256sum] = "7a3d626d044154e93c4d24a23f7c3dcc37cf0f182ed61cc0a40a55a623e85495"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_joyop-0.8.2-0"

inherit catkin
