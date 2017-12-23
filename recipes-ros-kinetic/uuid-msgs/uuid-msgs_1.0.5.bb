# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for universally unique identifiers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/kinetic/uuid_msgs/1.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a4be31a0bc9fd33213daee37e898cdd"
SRC_URI[sha256sum] = "48f1a7f03999df0e532ffdd6aea70920507c308c64b635cc7cf881462462534e"
S = "${WORKDIR}/unique_identifier-release-release-kinetic-uuid_msgs-1.0.5-0"

inherit catkin
