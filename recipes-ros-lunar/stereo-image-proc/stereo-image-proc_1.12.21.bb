# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Stereo and single image rectification and disparity processing."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure image-geometry image-proc image-transport message-filters nodelet sensor-msgs stereo-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/stereo_image_proc/1.12.21-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e5949d0601c949d24c44dbf1d45b2c9f"
SRC_URI[sha256sum] = "15fc9fbba35a0fd3548f867632ac545ba4359776884c9d853be04e7bb76f79f1"
S = "${WORKDIR}/image_pipeline-release-release-lunar-stereo_image_proc-1.12.21-0"

inherit catkin
