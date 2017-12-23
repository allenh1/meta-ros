# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native cv-bridge dynamic-reconfigure image-transport nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/kinetic/image_publisher/1.12.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "67ade8d9ed18f111f70cc6e0969b5173"
SRC_URI[sha256sum] = "2aea98dc2c11fdc3bad4c7073894360e020d74d385bcca06af2f9fddc26ea17a"
S = "${WORKDIR}/image_pipeline-release-release-kinetic-image_publisher-1.12.22-0"

inherit catkin
