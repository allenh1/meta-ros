# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_teleop_joy"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater image-view2 interactive-markers joy-mouse jsk-footstep-msgs jsk-interactive-marker jsk-rviz-plugins ps3joy python-pygame tf view-controller-msgs visualization-msgs"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/jsk_teleop_joy/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d62c22def4993d04416ff906136b885c"
SRC_URI[sha256sum] = "66df1da54f8a6b48c6c57df02346824176e3bc83df456efaefc15c4be5d4ba13"
S = "${WORKDIR}/jsk_control-release-release-kinetic-jsk_teleop_joy-0.1.13-0"

inherit catkin
