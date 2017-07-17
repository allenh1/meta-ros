# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for universally unique identifiers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=5135b76d0e00c6319a2c3853307c637d"

DEPENDS = "catkin message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/lunar/uuid_msgs/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bf66b69fa636a36a838b7c20e91fb671"
SRC_URI[sha256sum] = "9a1f564b92cfdd617241544e6b2e6de83a29021edf04e4afe2e7021d3813009e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
