# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Yujin's Open Control System messages, services and actions"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime std-msgs std-srvs"
SRC_URI = "https://github.com/yujinrobot-release/yocs_msgs-release/archive/release/kinetic/yocs_msgs/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fb0a4c981f0223f20b4acd800ae38e1e"
SRC_URI[sha256sum] = "d3107b489efdf0cbd26b5bb92e6a69a50d20581d4f313a5ad5d2253a0e379f99"
S = "${WORKDIR}/yocs_msgs-release-release-kinetic-yocs_msgs-0.6.3-0"

inherit catkin
