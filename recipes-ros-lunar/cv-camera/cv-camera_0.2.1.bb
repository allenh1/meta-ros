# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cv_camera uses OpenCV capture object to capture camera image.   This supports ca"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native catkin cv-bridge image-transport nodelet opencv3 roscpp roslint rostest sensor-msgs"
SRC_URI = "https://github.com/OTL/cv_camera-release/archive/release/lunar/cv_camera/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7dbe6c99fa86d1f4ac44cb8a3be45cb0"
SRC_URI[sha256sum] = "4f7bc93befa19a82231fb3bcc09abc1e0f0e14ef22e12f28d38c10214e95b7d6"
S = "${WORKDIR}/cv_camera-release-release-lunar-cv_camera-0.2.1-0"

inherit catkin
