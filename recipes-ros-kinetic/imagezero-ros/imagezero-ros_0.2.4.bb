# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A library that provides convenient methods for manipulating ROS images with Imag"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge imagezero message-runtime roscpp sensor-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/imagezero_transport-release/archive/release/kinetic/imagezero_ros/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6b0b3eb28e8b5813167ba995accc19b0"
SRC_URI[sha256sum] = "2bedb8482b007f719ba852a5377de055fd81cb67dbb75e3a7c29ba279d2d56af"
S = "${WORKDIR}/imagezero_transport-release-release-kinetic-imagezero_ros-0.2.4-0"

inherit catkin
