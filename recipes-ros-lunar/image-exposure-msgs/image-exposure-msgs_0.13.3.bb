# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages related to the Point Grey camera driver."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime statistics-msgs std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/lunar/image_exposure_msgs/0.13.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c7b06d5cea5eb00cdc71009d3989e99a"
SRC_URI[sha256sum] = "8b77a08b95634625f33998630bfa395b8a9874dbc9f775c352d46bf278413707"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-lunar-image_exposure_msgs-0.13.3-0"

inherit catkin
