# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This contains CvBridge, which converts between ROS     Image messages and OpenCV"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native opencv3 python rosconsole sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/kinetic/cv_bridge/1.12.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c23c43ed9fe5d39b76fd7f34e311d0a"
SRC_URI[sha256sum] = "16304c9fad874933353ed37a318ef8141fc6e0552df5dc84334742a48aac125d"
S = "${WORKDIR}/vision_opencv-release-release-kinetic-cv_bridge-1.12.7-0"

inherit catkin
