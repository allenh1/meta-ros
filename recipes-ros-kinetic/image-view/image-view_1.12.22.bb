# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple viewer for ROS image topics. Includes a specialized viewer   for stereo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers catkin-native cv-bridge dynamic-reconfigure gtk2 image-transport message-filters message-generation nodelet rosconsole roscpp sensor-msgs std-srvs stereo-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/kinetic/image_view/1.12.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2dc24d02fe1588c42851ca91bd8fcb07"
SRC_URI[sha256sum] = "8bb0f83781bfaf6bdd7365d4d9aef221a1154bf82f26f1f5ad28914eb8f5c6ae"
S = "${WORKDIR}/image_pipeline-release-release-kinetic-image_view-1.12.22-0"

inherit catkin
