# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS camera driver that uses gstreamer to connect to     devices such as webcam"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers camera-info-manager python-empy-native cv-bridge image-transport libgstreamer-plugins-base1.0-dev libgstreamer1.0-dev nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/gscam-release/archive/release/lunar/gscam/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0645b1d3fbad05b5d249a40368da7ff1"
SRC_URI[sha256sum] = "5aae479a2334ccee471588645fa40d6e870e6eaceb66cd6ca89b547e694e76e4"
S = "${WORKDIR}/gscam-release-release-lunar-gscam-1.0.0-0"

inherit catkin
