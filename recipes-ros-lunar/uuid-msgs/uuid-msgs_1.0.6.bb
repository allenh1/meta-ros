# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for universally unique identifiers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/lunar/uuid_msgs/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bf66b69fa636a36a838b7c20e91fb671"
SRC_URI[sha256sum] = "9a1f564b92cfdd617241544e6b2e6de83a29021edf04e4afe2e7021d3813009e"
S = "${WORKDIR}/unique_identifier-release-release-lunar-uuid_msgs-1.0.6-0"

inherit catkin
