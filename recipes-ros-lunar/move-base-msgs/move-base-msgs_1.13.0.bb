# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "actionlib-msgs python-empy-native geometry-msgs message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/navigation_msgs-release/archive/release/lunar/move_base_msgs/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "107007d4f5c3cc3379a14c650f94654f"
SRC_URI[sha256sum] = "2b7c18923591e5dc65905d4929512035b66738d5dd20fd79c2a4642b42b3731e"
S = "${WORKDIR}/navigation_msgs-release-release-lunar-move_base_msgs-1.13.0-0"

inherit catkin
