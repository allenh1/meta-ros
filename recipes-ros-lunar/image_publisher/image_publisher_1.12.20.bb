# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=1bdb48b0ac586cfe2bc0783b4a031453"

DEPENDS = "camera_info_manager catkin cv_bridge dynamic_reconfigure image_transport nodelet roscpp sensor_msgs"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/image_publisher/1.12.20-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "97d9f6a36b5b9a1ee80537fb078c59fa"
SRC_URI[sha256sum] = "4527ccb9443bf012c4922263e6d24a7ca7687ad4d4e2326668195fc61973227c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
