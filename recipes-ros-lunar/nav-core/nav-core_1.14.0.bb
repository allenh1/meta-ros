# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides common interfaces for navigation specific robot actions. C"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=acbed67fd486c51e7a0624505f2e6733"

DEPENDS = "catkin costmap-2d geometry-msgs std-msgs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/nav_core/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a9690de05c68ef8d3dd7fd6ee300eeb4"
SRC_URI[sha256sum] = "7340c271f86b85f4acc84456a58e818755c2b403611e931a4d6726cadba62613"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
