# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides functionality to simplify working with the     navigation "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native marti-common-msgs marti-nav-msgs roscpp swri-geometry-util swri-math-util swri-transform-util visualization-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_route_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "799924d98c63afa87822756d51865149"
SRC_URI[sha256sum] = "48dcd36c7148051e4c5e03721d6adfcf28457b43540e81d5e80a6695f6063f72"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_route_util-2.0.0-0"

inherit catkin
