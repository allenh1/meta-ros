# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS driver for OpenNI depth (+ RGB) cameras. These include:         Microsoft "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native dynamic-reconfigure image-transport libopenni-dev libusb-1.0-dev log4cxx nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/openni_camera-release/archive/release/kinetic/openni_camera/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4ea5b7bc89eebc7302bd489d26a08da2"
SRC_URI[sha256sum] = "ddaa7175673047a2f910e147725e582d8d03b068d26b5fa8165563930ea94f8f"
S = "${WORKDIR}/openni_camera-release-release-kinetic-openni_camera-1.9.5-0"

inherit catkin
