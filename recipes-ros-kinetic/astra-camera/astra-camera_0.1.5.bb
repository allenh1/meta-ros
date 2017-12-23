# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Drivers for Orbbec Astra Devices."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native dynamic-reconfigure git image-transport libudev-dev libusb-1.0-dev message-generation message-runtime nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/astra_camera-release/archive/release/kinetic/astra_camera/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "491369b8868ec98b327257ef1294663c"
SRC_URI[sha256sum] = "7b1d28c2dbd161cb3b7b0787736a35ceb9f017a6cadc9a2a4b92619258a96115"
S = "${WORKDIR}/astra_camera-release-release-kinetic-astra_camera-0.1.5-0"

inherit catkin
