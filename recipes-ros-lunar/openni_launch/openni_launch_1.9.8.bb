# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files to open an OpenNI device and load all nodelets to 
     convert raw"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=35302424fd22d1c8d4bc1d1e1f5da785"

DEPENDS = "catkin nodelet openni_camera rgbd_launch roslaunch"
SRC_URI = "https://github.com/ros-gbp/openni_launch-release/archive/release/lunar/openni_launch/1.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "897b6a34a118e1d1200668c351b774d7"
SRC_URI[sha256sum] = "8f8b99f525c813f34ec2f50131ac64515fcb794b2a53caa4dd9c1e975cceda01"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
