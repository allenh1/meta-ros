# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides common interfaces for navigation specific robot actions. C"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin-native costmap-2d geometry-msgs std-msgs tf"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/kinetic/nav_core/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dbde1bf57acb8b2e792668074f3be046"
SRC_URI[sha256sum] = "02ed4c277f4e4a42f70a6114e0ca4d50b142240883d358d3801db111964b448c"
S = "${WORKDIR}/navigation-release-release-kinetic-nav_core-1.14.2-0"

inherit catkin
