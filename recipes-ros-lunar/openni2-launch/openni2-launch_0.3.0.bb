# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files to start the openni2_camera drivers using rgbd_launch."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native depth-image-proc image-proc nodelet openni2-camera python-catkin-pkg-native rgbd-launch tf"
SRC_URI = "https://github.com/ros-gbp/openni2_camera-release/archive/release/lunar/openni2_launch/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f9f4ab8290e8683550b4ba09418148d1"
SRC_URI[sha256sum] = "82911fd82e30b6c1a5f5fcd9a7dc680c558fb8f4c8e243725b085fe46468af63"
S = "${WORKDIR}/openni2_camera-release-release-lunar-openni2_launch-0.3.0-0"

inherit catkin
