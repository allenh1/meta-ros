# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Stereo and single image rectification and disparity processing."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure image-geometry image-proc image-transport message-filters nodelet sensor-msgs stereo-msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/kinetic/stereo_image_proc/1.12.22-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fa8a67b608e48d3f37636bfca4ddac86"
SRC_URI[sha256sum] = "88e96ac6cdd3156014df8f5d3f4e60c691c190ef238603983b5d1b718567dd30"
S = "${WORKDIR}/image_pipeline-release-release-kinetic-stereo_image_proc-1.12.22-0"

inherit catkin
