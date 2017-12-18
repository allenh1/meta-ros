# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Point Grey camera driver based on libflycapture2."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native catkin curl diagnostic-updater dpkg dynamic-reconfigure image-exposure-msgs image-proc image-transport libraw1394-dev libusb-1.0-dev nodelet roscpp sensor-msgs stereo-image-proc wfov-camera-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/lunar/pointgrey_camera_driver/0.13.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8a888b75567327207c9173582335b4a"
SRC_URI[sha256sum] = "99ba37b57ed9bfa3c639c29b22627320e7ef02f09847ce82debbc7f0c63baef5"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-lunar-pointgrey_camera_driver-0.13.3-0"

inherit catkin
