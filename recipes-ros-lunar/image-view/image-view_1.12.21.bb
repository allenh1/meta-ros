# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple viewer for ROS image topics. Includes a specialized viewer   for stereo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers catkin-native cv-bridge dynamic-reconfigure gtk2 image-transport message-filters message-generation nodelet rosconsole roscpp sensor-msgs std-srvs stereo-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/image_view/1.12.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "97194b8451571c93b35f578397dca27b"
SRC_URI[sha256sum] = "4316b4bc3fa2b0b81afc504f77d7e65e597092f8c26b519b7f2e1581ccded2e4"
S = "${WORKDIR}/image_pipeline-release-release-lunar-image_view-1.12.21-0"

inherit catkin
