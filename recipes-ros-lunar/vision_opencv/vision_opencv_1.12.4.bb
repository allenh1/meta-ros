# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Packages for interfacing ROS with OpenCV, a library of programming functions for"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin cv_bridge image_geometry"
SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/lunar/vision_opencv/1.12.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "99372ec6afe36707a1935a8fe7fbd25d"
SRC_URI[sha256sum] = "e3990a66a7d208de726003361f2b9a0a72e76afce26e8a741920b53be770af15"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
