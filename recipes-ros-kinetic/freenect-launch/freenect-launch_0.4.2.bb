# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files for freenect_camera to produce rectified, registered     or dispari"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native freenect-camera image-proc nodelet rgbd-launch tf"
SRC_URI = "https://github.com/ros-drivers-gbp/freenect_stack-release/archive/release/kinetic/freenect_launch/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b92165a6e1b5abbc884de57284986c0e"
SRC_URI[sha256sum] = "c066e806f953b5f3e37aac19086bb8316b20bcf58437d7df63be5562589d669a"
S = "${WORKDIR}/freenect_stack-release-release-kinetic-freenect_launch-0.4.2-0"

inherit catkin
