# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A collection of node(let)s that stream images from USB cameras (UVC)      and pr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "camera-info-manager catkin-native image-transport libv4l-dev nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/lunar/uvc_camera/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ee860e9ef117cc04aeb0b709d00e8509"
SRC_URI[sha256sum] = "795a9d1f7d3c51475b048de7a84f9ac594110522f168cef86afb4c28af59d26d"
S = "${WORKDIR}/camera_umd-release-release-lunar-uvc_camera-0.2.5-0"

inherit catkin
