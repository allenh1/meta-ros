# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides common interfaces for navigation specific robot actions. C"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=336753c98c447e9b6f17a7e2dee353e3"

DEPENDS = "catkin costmap_2d geometry_msgs std_msgs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/nav_core/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a9690de05c68ef8d3dd7fd6ee300eeb4"
SRC_URI[sha256sum] = "7340c271f86b85f4acc84456a58e818755c2b403611e931a4d6726cadba62613"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
