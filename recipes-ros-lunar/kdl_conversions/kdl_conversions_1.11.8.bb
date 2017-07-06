# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry_msgs orocos_kdl"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/lunar/kdl_conversions/1.11.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "55d86f97d5be30532954a4fe78c3252c"
SRC_URI[sha256sum] = "3ddacec3aa35e6e427695744c2486802c13c35fd75fb3140475f3e8c4e7b94b2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
