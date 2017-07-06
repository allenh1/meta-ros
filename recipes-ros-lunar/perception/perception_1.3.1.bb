# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=6;endline=6;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin image_common image_pipeline image_transport_plugins laser_pipeline perception_pcl ros_base vision_opencv"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/perception/1.3.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db994935b163130a3322e061b9a070c3"
SRC_URI[sha256sum] = "484d68e896aed018d225cba1eba7ef96c1a28fb670414a4d904187024f37a25b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
