# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains nodelets for processing depth images such as those      produced by Ope"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "boost catkin cmake-modules cv-bridge eigen-conversions image-geometry image-transport message-filters nodelet sensor-msgs stereo-msgs tf2 tf2-ros"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/depth_image_proc/1.12.20-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d2720003696f0e6cb2607037f5462335"
SRC_URI[sha256sum] = "ea2a8e946d3dae2dd7a9ef2bd1ef1f9d736790dd58f468317c3c1955cd7e4740"
S = "${WORKDIR}/image_pipeline-release-release-lunar-depth_image_proc-1.12.20-0"

inherit catkin
