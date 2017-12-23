# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_marker_drawing provides convenience functions for easier publishing of vi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native eigen roscpp visualization-msgs"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/kinetic/hector_marker_drawing/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7712ba750cb1ac9c611a41a951f6fbdc"
SRC_URI[sha256sum] = "f7668e98788044b276c795338e1f59ea346b8c5dbc0bcba540632415d6526cca"
S = "${WORKDIR}/hector_slam-release-release-kinetic-hector_marker_drawing-0.3.5-0"

inherit catkin
