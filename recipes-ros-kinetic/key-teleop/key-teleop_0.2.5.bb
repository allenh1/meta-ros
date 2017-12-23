# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A text-based interface to send a robot movement commands"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs rospy"
SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/kinetic/key_teleop/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "882f1696c875e542abd14eb20fa1e8c1"
SRC_URI[sha256sum] = "5bea6befb2355cf975dfd9014b0a8f9101887fbe9553123488f68638b0f6c886"
S = "${WORKDIR}/teleop_tools-release-release-kinetic-key_teleop-0.2.5-0"

inherit catkin
