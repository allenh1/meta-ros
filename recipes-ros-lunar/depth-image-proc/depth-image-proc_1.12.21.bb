# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains nodelets for processing depth images such as those      produced by Ope"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native catkin cmake-modules cv-bridge eigen-conversions image-geometry image-transport message-filters nodelet sensor-msgs stereo-msgs tf2 tf2-ros"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/depth_image_proc/1.12.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "63fb954df8e70b916daebfddf4a5f5e2"
SRC_URI[sha256sum] = "f4d691bcb2b3dd5371909ea244d2658fcd6679729260a7f30a32ff5f9a3a5f94"
S = "${WORKDIR}/image_pipeline-release-release-lunar-depth_image_proc-1.12.21-0"

inherit catkin
