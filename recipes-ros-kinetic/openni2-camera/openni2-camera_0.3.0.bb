# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Drivers for the Asus Xtion and Primesense Devices. For using a kinect   with ROS"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native dynamic-reconfigure image-transport libopenni2-dev message-generation message-runtime nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/openni2_camera-release/archive/release/kinetic/openni2_camera/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5e623866f0d26853029f4a62e38e297b"
SRC_URI[sha256sum] = "e1e6ef6186027b792dc904f714a27298ff6339b86ebe3b2002ac4003ee00ef63"
S = "${WORKDIR}/openni2_camera-release-release-kinetic-openni2_camera-0.3.0-0"

inherit catkin
