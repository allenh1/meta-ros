# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides functionality to simplify working with the     navigation "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin marti-common-msgs marti-nav-msgs roscpp swri-geometry-util swri-math-util swri-transform-util visualization-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_route_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2b981c59e892e4b405937eafba8f15f"
SRC_URI[sha256sum] = "48b827bdecd164d88f7901d342f4845b3de242e8589f9c1456b5869ed56cde2c"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_route_util-2.0.0-0"

inherit catkin
