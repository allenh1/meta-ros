# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin image-common image-pipeline image-transport-plugins laser-pipeline perception-pcl ros-base vision-opencv"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/${PN}/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db994935b163130a3322e061b9a070c3"
SRC_URI[sha256sum] = "484d68e896aed018d225cba1eba7ef96c1a28fb670414a4d904187024f37a25b"
S = "${WORKDIR}/metapackages-release-release-lunar-${PN}-1.3.1-0"

inherit catkin
