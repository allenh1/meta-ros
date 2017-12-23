# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages related to the Point Grey camera driver."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime statistics-msgs std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/kinetic/image_exposure_msgs/0.13.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e9b08fb53745d5c3d3444b4fb6a4a9a"
SRC_URI[sha256sum] = "c00581c3619079fa862447f37878201086bbd62a8f65405e68c80af761beba61"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-kinetic-image_exposure_msgs-0.13.4-0"

inherit catkin
