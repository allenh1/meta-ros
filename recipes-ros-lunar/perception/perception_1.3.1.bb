# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=43c1692bfe529946c4797980e7d64a6d"

DEPENDS = "catkin image_common image_pipeline image_transport_plugins laser_pipeline perception_pcl ros_base vision_opencv"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/perception/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db994935b163130a3322e061b9a070c3"
SRC_URI[sha256sum] = "484d68e896aed018d225cba1eba7ef96c1a28fb670414a4d904187024f37a25b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
