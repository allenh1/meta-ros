# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_tools"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin tf2 tf2_msgs tf2_ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_tools/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2f518883287ce75394ce61a971d0f950"
SRC_URI[sha256sum] = "ec8150ce96e2b91dcb9d7d458cdfc5a054bac46fb5b9ff87ac341ebf999d5d77"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
