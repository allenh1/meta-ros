# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A collection of node(let)s that stream images from USB cameras (UVC)      and pr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "camera-info-manager catkin-native image-transport libv4l-dev nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/kinetic/uvc_camera/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b80207fa8c2763a49c3f096141b40bb"
SRC_URI[sha256sum] = "8030386cedd18de89882da3d7701676d4f9d771a74a2e4db87c1f51133cad395"
S = "${WORKDIR}/camera_umd-release-release-kinetic-uvc_camera-0.2.5-0"

inherit catkin
