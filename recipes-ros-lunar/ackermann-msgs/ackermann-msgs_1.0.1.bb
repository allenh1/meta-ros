# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for robots using Ackermann steering."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/ackermann_msgs-release/archive/release/lunar/ackermann_msgs/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5ea5b7da256fa43368bc83815e7615e"
SRC_URI[sha256sum] = "8b8598ad6531461ad8f7e352a64277c94dbc0a243ecd14f5c6fe1723554af40b"
S = "${WORKDIR}/ackermann_msgs-release-release-lunar-ackermann_msgs-1.0.1-0"

inherit catkin
