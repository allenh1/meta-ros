# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "this package contains a set of messages that are used by the introspection     i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/kinetic/smach_msgs/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "36aa7974db6d228447514555f6aa0031"
SRC_URI[sha256sum] = "a631bbe6e98228624f07877ab7581a01c9881c96c69c1a57b757e0a4df5a0c01"
S = "${WORKDIR}/executive_smach-release-release-kinetic-smach_msgs-2.0.1-0"

inherit catkin
