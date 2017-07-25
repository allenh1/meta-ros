# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Stereo and single image rectification and disparity processing."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure image-geometry image-proc image-transport message-filters nodelet sensor-msgs stereo-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/stereo_image_proc/1.12.20-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5648a87ce063dde87b6afb73d79df96f"
SRC_URI[sha256sum] = "1fdde9b5b6340cbd8db9d20a2af8740a760133043a8e1d59d6e253699589f1cb"
S = "${WORKDIR}/image_pipeline-release-release-lunar-stereo_image_proc-1.12.20-0"

inherit catkin
