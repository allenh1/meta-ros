# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A libfreenect-based ROS driver for the Microsoft Kinect.  This is     a port of "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native diagnostic-updater dynamic-reconfigure image-transport libfreenect log4cxx nodelet pluginlib roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/freenect_stack-release/archive/release/kinetic/freenect_camera/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a30205e8520004a94171139e113b057"
SRC_URI[sha256sum] = "671ddb218106633626d497ab69fd7ccc2efaef187d2db5ae557ac9aa91873c7b"
S = "${WORKDIR}/freenect_stack-release-release-kinetic-freenect_camera-0.4.2-0"

inherit catkin
