# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Point Grey camera driver based on libflycapture2."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native curl diagnostic-updater dpkg dynamic-reconfigure image-exposure-msgs image-proc image-transport libraw1394-dev libusb-1.0-dev nodelet roscpp sensor-msgs stereo-image-proc wfov-camera-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/kinetic/pointgrey_camera_driver/0.13.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fdd2adc63efe7a61af0f8195568b5488"
SRC_URI[sha256sum] = "5071819dbbc690a77113595dba44f1d6ba7baef7cd7ec55c4f120b11ed20e086"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-kinetic-pointgrey_camera_driver-0.13.4-0"

inherit catkin
