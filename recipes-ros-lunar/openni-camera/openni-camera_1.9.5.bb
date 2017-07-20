# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS driver for OpenNI depth (+ RGB) cameras. These include:         Microsoft "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "camera_info_manager catkin dynamic_reconfigure image_transport libopenni-dev libusb-1.0-dev log4cxx nodelet roscpp sensor_msgs"
SRC_URI = "https://github.com/ros-gbp/openni_camera-release/archive/release/lunar/openni_camera/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "32e103ff8d0e5f57d074fddb984b259b"
SRC_URI[sha256sum] = "018b6fdd13d35fd40980450a9aef83267eeeabb9392849b2144f90ca7df6fae7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
