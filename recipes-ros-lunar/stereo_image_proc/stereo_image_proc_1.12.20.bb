# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Stereo and single image rectification and disparity processing."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=880229e1a8f45f2b2d04ef8047adc996"

DEPENDS = "catkin cv_bridge dynamic_reconfigure image_geometry image_proc image_transport message_filters nodelet sensor_msgs stereo_msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/stereo_image_proc/1.12.20-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5648a87ce063dde87b6afb73d79df96f"
SRC_URI[sha256sum] = "1fdde9b5b6340cbd8db9d20a2af8740a760133043a8e1d59d6e253699589f1cb"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
