# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=21;endline=21;md5=7389aef5a605df7910cbc0188bffd7bb"

DEPENDS = "camera_info_manager catkin image_transport libv4l-dev nodelet roscpp sensor_msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/lunar/uvc_camera/0.2.5-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ee860e9ef117cc04aeb0b709d00e8509"
SRC_URI[sha256sum] = "795a9d1f7d3c51475b048de7a84f9ac594110522f168cef86afb4c28af59d26d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
