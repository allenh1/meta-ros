# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cv_camera uses OpenCV capture object to capture camera image.   This supports ca"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native cv-bridge image-transport nodelet opencv3 roscpp roslint rostest sensor-msgs"
SRC_URI = "https://github.com/OTL/cv_camera-release/archive/release/kinetic/cv_camera/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "503e592ab8fbef56c57b40d47e3f4417"
SRC_URI[sha256sum] = "a89967f570dea9bf79137fe0b32f08b56d44159c48d516c3c8aecdb20437211f"
S = "${WORKDIR}/cv_camera-release-release-kinetic-cv_camera-0.3.0-0"

inherit catkin
