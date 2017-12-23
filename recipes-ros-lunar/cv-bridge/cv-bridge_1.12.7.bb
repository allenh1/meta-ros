# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This contains CvBridge, which converts between ROS     Image messages and OpenCV"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native catkin opencv3 python rosconsole sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/lunar/cv_bridge/1.12.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0bfdd8d9ab55745ac79edd5c3ce30403"
SRC_URI[sha256sum] = "136e001b8aff9974349e9219b8d672c2c39734c2f7e55d8e2fb20a53e80d4094"
S = "${WORKDIR}/vision_opencv-release-release-lunar-cv_bridge-1.12.7-0"

inherit catkin
