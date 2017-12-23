# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RealSense Camera package allowing access to Intel 3D cameras and advanced module"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=4bcd5f0e140091c68f8c0bcfdd6181e0"

DEPENDS = "boost camera-info-manager catkin-native cv-bridge dynamic-reconfigure image-transport librealsense message-generation message-runtime nodelet pcl-ros rgbd-launch roscpp roslint rostest sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/intel-ros/realsense-release/archive/release/kinetic/realsense_camera/1.8.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24a4c11b7f2fe5b797f423b6a86374df"
SRC_URI[sha256sum] = "dd57a362aa43f90e26f09f30172a7338108d4ced737300c15b8a983cb3f7bec2"
S = "${WORKDIR}/realsense-release-release-kinetic-realsense_camera-1.8.1-1"

inherit catkin
